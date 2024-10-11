# VehicleRegistrationSchema


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certificate_data** | [**VehicleRegistrationSchemaCertificateData**](VehicleRegistrationSchemaCertificateData.md) |  | 
**issued_by** | [**VehicleRegistrationSchemaIssuedBy**](VehicleRegistrationSchemaIssuedBy.md) |  | 
**issued_to** | [**VehicleRegistrationSchemaIssuedTo**](VehicleRegistrationSchemaIssuedTo.md) |  | 
**expiry_date** | **str** |  | [optional] 
**issue_date** | **str** |  | 
**issued_at** | **str** |  | 
**language** | **str** |  | 
**name** | **str** |  | 
**number** | **int** |  | 
**status** | **str** |  | 
**type** | **str** |  | 
**valid_from_date** | **str** |  | 

## Example

```python
from openapi_client.models.vehicle_registration_schema import VehicleRegistrationSchema

# TODO update the JSON string below
json = "{}"
# create an instance of VehicleRegistrationSchema from a JSON string
vehicle_registration_schema_instance = VehicleRegistrationSchema.from_json(json)
# print the JSON string representation of the object
print(VehicleRegistrationSchema.to_json())

# convert the object into a dict
vehicle_registration_schema_dict = vehicle_registration_schema_instance.to_dict()
# create an instance of VehicleRegistrationSchema from a dict
vehicle_registration_schema_from_dict = VehicleRegistrationSchema.from_dict(vehicle_registration_schema_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


