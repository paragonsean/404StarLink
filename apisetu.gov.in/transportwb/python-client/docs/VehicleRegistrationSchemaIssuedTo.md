# VehicleRegistrationSchemaIssuedTo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**person** | [**VehicleRegistrationSchemaIssuedToPerson**](VehicleRegistrationSchemaIssuedToPerson.md) |  | 

## Example

```python
from openapi_client.models.vehicle_registration_schema_issued_to import VehicleRegistrationSchemaIssuedTo

# TODO update the JSON string below
json = "{}"
# create an instance of VehicleRegistrationSchemaIssuedTo from a JSON string
vehicle_registration_schema_issued_to_instance = VehicleRegistrationSchemaIssuedTo.from_json(json)
# print the JSON string representation of the object
print(VehicleRegistrationSchemaIssuedTo.to_json())

# convert the object into a dict
vehicle_registration_schema_issued_to_dict = vehicle_registration_schema_issued_to_instance.to_dict()
# create an instance of VehicleRegistrationSchemaIssuedTo from a dict
vehicle_registration_schema_issued_to_from_dict = VehicleRegistrationSchemaIssuedTo.from_dict(vehicle_registration_schema_issued_to_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


