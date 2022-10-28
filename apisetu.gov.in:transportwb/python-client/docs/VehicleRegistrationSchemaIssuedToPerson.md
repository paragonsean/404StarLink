# VehicleRegistrationSchemaIssuedToPerson


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | [**AcademicCertificateSchemaIssuedToPersonAddress**](AcademicCertificateSchemaIssuedToPersonAddress.md) |  | 
**photo** | [**AcademicCertificateSchemaIssuedToPersonPhoto**](AcademicCertificateSchemaIssuedToPersonPhoto.md) |  | 
**dob** | **str** |  | 
**email** | **str** |  | 
**gender** | **str** |  | 
**marital_status** | **str** |  | 
**name** | **str** |  | 
**phone** | **str** |  | 
**religion** | **str** |  | 
**swd** | **str** |  | 
**swd_indicator** | **str** |  | 
**title** | **str** |  | 
**uid** | **str** |  | 

## Example

```python
from openapi_client.models.vehicle_registration_schema_issued_to_person import VehicleRegistrationSchemaIssuedToPerson

# TODO update the JSON string below
json = "{}"
# create an instance of VehicleRegistrationSchemaIssuedToPerson from a JSON string
vehicle_registration_schema_issued_to_person_instance = VehicleRegistrationSchemaIssuedToPerson.from_json(json)
# print the JSON string representation of the object
print(VehicleRegistrationSchemaIssuedToPerson.to_json())

# convert the object into a dict
vehicle_registration_schema_issued_to_person_dict = vehicle_registration_schema_issued_to_person_instance.to_dict()
# create an instance of VehicleRegistrationSchemaIssuedToPerson from a dict
vehicle_registration_schema_issued_to_person_from_dict = VehicleRegistrationSchemaIssuedToPerson.from_dict(vehicle_registration_schema_issued_to_person_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


