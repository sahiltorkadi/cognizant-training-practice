import { TestBed } from '@angular/core/testing';
import { ConvertService } from '../convert/convert.service';

describe('MessageService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ConvertService = TestBed.get(ConvertService);
    expect(service).toBeTruthy();
  });
});
