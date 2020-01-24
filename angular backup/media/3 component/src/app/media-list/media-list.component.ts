import { Component, OnInit, Input } from '@angular/core';
import { media } from '../model/media.model';

@Component({
  selector: 'app-media-list',
  templateUrl: './media-list.component.html',
  styleUrls: ['./media-list.component.css']
})
export class MediaListComponent implements OnInit {
  @Input()
  mediaList : Array<media>;


  constructor() { }

  ngOnInit() {
  }

}
