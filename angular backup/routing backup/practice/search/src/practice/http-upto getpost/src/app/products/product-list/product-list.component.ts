import { Product } from 'src/app/models/product.model';
import { ProductDataService } from 'src/app/services/data/data.service.service';
import { OnInit, Component } from '@angular/core';

@Component({
  selector: 'app-product-add',
  templateUrl: './product-add.component.html',
  styleUrls: ['./product-add.component.css']
})
export class ProductAddComponent implements OnInit {

  constructor(public productService: ProductDataService) { }

  ngOnInit() {
  }


  saveProduct(txtName:HTMLInputElement, txtCategory:HTMLInputElement, txtCost:HTMLInputElement):void{
    
    let product = new Product(txtName.value, txtCategory.value, parseInt(txtCost.value));

    this.productService.addNewProduct(product).subscribe((response) => console.log(response));


    txtName.value = "";
    txtCategory.value = "";
    txtCost.value = "";
}

}