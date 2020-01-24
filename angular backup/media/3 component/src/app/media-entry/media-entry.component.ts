import { media } from '../model/media.model';
import { EventEmitter, Output, OnInit, Component } from '@angular/core';

@Component({
  selector: 'app-media-entry',
  templateUrl: './media-entry.component.html',
  styleUrls: ['./media-entry.component.css']
})
export class MediaEntryComponent implements OnInit {
  @Output()
  submit_info : EventEmitter<media>;
  constructor() {
    this.submit_info = new EventEmitter();
   }
   saveMedia(txtTitle:HTMLInputElement, txtDescription:HTMLInputElement, txtTag:HTMLInputElement,txtImg:HTMLInputElement):void{
    let newmedia = new media(txtTitle.value, txtDescription.value, txtTag.value,txtImg.value);
    this.submit_info.emit(newmedia);
    
    txtTitle.value = "";
    txtDescription.value = "";
    txtTag.value = "";
    txtImg.value = "";
   }
  ngOnInit(){
  }

}
