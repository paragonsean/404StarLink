# VehicleRegistrationSchemaIssuedByOrganization


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | [**AcademicCertificateSchemaIssuedByOrganizationAddress**](AcademicCertificateSchemaIssuedByOrganizationAddress.md) |  | 
**code** | **str** |  | 
**name** | **str** |  | 
**tin** | **str** |  | 
**type** | **str** |  | 
**uid** | **str** |  | 

## Example

```python
from openapi_client.models.vehicle_registration_schema_issued_by_organization import VehicleRegistrationSchemaIssuedByOrganization

# TODO update the JSON string below
json = "{}"
# create an instance of VehicleRegistrationSchemaIssuedByOrganization from a JSON string
vehicle_registration_schema_issued_by_organization_instance = VehicleRegistrationSchemaIssuedByOrganization.from_json(json)
# print the JSON string representation of the object
print(VehicleRegistrationSchemaIssuedByOrganization.to_json())

# convert the object into a dict
vehicle_registration_schema_issued_by_organization_dict = vehicle_registration_schema_issued_by_organization_instance.to_dict()
# create an instance of VehicleRegistrationSchemaIssuedByOrganization from a dict
vehicle_registration_schema_issued_by_organization_from_dict = VehicleRegistrationSchemaIssuedByOrganization.from_dict(vehicle_registration_schema_issued_by_organization_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


