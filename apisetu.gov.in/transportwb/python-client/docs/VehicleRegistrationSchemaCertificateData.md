# VehicleRegistrationSchemaCertificateData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vehicle_registration** | [**VehicleRegistrationSchemaCertificateDataVehicleRegistration**](VehicleRegistrationSchemaCertificateDataVehicleRegistration.md) |  | [optional] 

## Example

```python
from openapi_client.models.vehicle_registration_schema_certificate_data import VehicleRegistrationSchemaCertificateData

# TODO update the JSON string below
json = "{}"
# create an instance of VehicleRegistrationSchemaCertificateData from a JSON string
vehicle_registration_schema_certificate_data_instance = VehicleRegistrationSchemaCertificateData.from_json(json)
# print the JSON string representation of the object
print(VehicleRegistrationSchemaCertificateData.to_json())

# convert the object into a dict
vehicle_registration_schema_certificate_data_dict = vehicle_registration_schema_certificate_data_instance.to_dict()
# create an instance of VehicleRegistrationSchemaCertificateData from a dict
vehicle_registration_schema_certificate_data_from_dict = VehicleRegistrationSchemaCertificateData.from_dict(vehicle_registration_schema_certificate_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


