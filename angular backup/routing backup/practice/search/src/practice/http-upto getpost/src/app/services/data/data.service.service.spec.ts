import { TestBed } from '@angular/core/testing';
import { ProductDataService } from './data.service.service';


describe('productDataService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ProductDataService = TestBed.get(ProductDataService);
    expect(service).toBeTruthy();
  });
});
