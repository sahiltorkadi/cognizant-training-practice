import { Component, OnInit } from '@angular/core';
import { media } from '../model/media.model';

@Component({
  selector: 'app-media',
  templateUrl: './media.component.html',
  styleUrls: ['./media.component.css']
})
export class MediaComponent implements OnInit {
  medias : Array<media>;
  constructor() {
    this.medias = [
      new media("img1","background-image","bg","Nature"),
      new media("img2","logo-image","logo","face"),
      new media("img3","gif-image","gif","welcome")
    ]
   }
   saveMedia(txtTitle:HTMLInputElement, txtDescription:HTMLInputElement, txtTag:HTMLInputElement,txtImg:HTMLInputElement):void{
    let newmedia = new media(txtTitle.value, txtDescription.value, txtTag.value,txtImg.value);
    this.medias.push(newmedia);
    txtTitle.value = "";
    txtDescription.value = "";
    txtTag.value = "";
    txtImg.value = "";
}

  ngOnInit() {
  }

}
