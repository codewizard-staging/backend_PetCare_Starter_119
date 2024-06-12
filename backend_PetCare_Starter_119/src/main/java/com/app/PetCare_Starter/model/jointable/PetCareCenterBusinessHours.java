package com.app.PetCare_Starter.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.PetCare_Starter.model.Manager;
import com.app.PetCare_Starter.model.Pet;
import com.app.PetCare_Starter.model.PetCareCenter;
import com.app.PetCare_Starter.model.PetOwner;
import com.app.PetCare_Starter.model.Document;
import com.app.PetCare_Starter.model.PetService;
import com.app.PetCare_Starter.enums.PetServiceType;
import com.app.PetCare_Starter.converter.PetServiceTypeConverter;

@Entity(name = "PetCareCenterBusinessHours")
@Table(schema = "\"petcare_starter\"", name = "\"PetCareCenterBusinessHours\"")
@Data
public class PetCareCenterBusinessHours{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"PcId\"")
	private Integer pcId;

    
    @Column(name = "\"BusinessHours\"")
    private Integer businessHours;
}