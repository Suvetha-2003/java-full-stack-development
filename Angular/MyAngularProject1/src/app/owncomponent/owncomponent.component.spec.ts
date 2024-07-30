import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OwncomponentComponent } from './owncomponent.component';

describe('OwncomponentComponent', () => {
  let component: OwncomponentComponent;
  let fixture: ComponentFixture<OwncomponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [OwncomponentComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(OwncomponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
