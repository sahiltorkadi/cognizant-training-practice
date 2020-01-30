import { Router } from '@angular/router';
import { ProductDataService } from 'src/app/services/data/data.service.service';
import { Product } from 'src/app/models/product.model';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  products : Array<Product>; // will be initilized from data coming from server
  // dependent on product-data-service
  constructor(private productService : ProductDataService, public router : Router) { 

  }

  add(){
    // navigate to product-add component
    this.router.navigate(['/product-add']);
  }


  ngOnInit() {
    // load data from server on initialization
    // need to call getAllProducts() method of ProductDataService
    // this.products = this.productService.getAllProducts();
    // response : response data from server : Array of products
    this.productService.getAllProducts().subscribe((response:any) => this.products = response);
  }

}