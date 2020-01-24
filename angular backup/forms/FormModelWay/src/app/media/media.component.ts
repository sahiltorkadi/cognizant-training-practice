import { Component, OnInit } from '@angular/core';
import { media } from '../model/media.model';

@Component({
  selector: 'app-media',
  templateUrl: './media.component.html',
  styleUrls: ['./media.component.css']
})
export class MediaComponent implements OnInit {

  medias : Array<media>;

  ngOnInit(): void {
   
  }
 
  constructor() {
    this.medias = [
      new media("img1","background-image","bg","Nature"),
      new media("img2","logo-image","logo","face"),
      new media("img3","gif-image","gif","welcome")
    ]
   }
  
   addNewMedia(media:media):void{
   
    this.medias.push(media);
  }

}



