# VehicleRegistrationSchemaCertificateDataVehicleRegistration


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**insurance** | [**VehicleRegistrationSchemaCertificateDataVehicleRegistrationInsurance**](VehicleRegistrationSchemaCertificateDataVehicleRegistrationInsurance.md) |  | [optional] 
**vehicle** | [**VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle**](VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle.md) |  | [optional] 
**financer** | **str** |  | 
**norms_desc** | **str** |  | 
**status_date** | **str** |  | 

## Example

```python
from openapi_client.models.vehicle_registration_schema_certificate_data_vehicle_registration import VehicleRegistrationSchemaCertificateDataVehicleRegistration

# TODO update the JSON string below
json = "{}"
# create an instance of VehicleRegistrationSchemaCertificateDataVehicleRegistration from a JSON string
vehicle_registration_schema_certificate_data_vehicle_registration_instance = VehicleRegistrationSchemaCertificateDataVehicleRegistration.from_json(json)
# print the JSON string representation of the object
print(VehicleRegistrationSchemaCertificateDataVehicleRegistration.to_json())

# convert the object into a dict
vehicle_registration_schema_certificate_data_vehicle_registration_dict = vehicle_registration_schema_certificate_data_vehicle_registration_instance.to_dict()
# create an instance of VehicleRegistrationSchemaCertificateDataVehicleRegistration from a dict
vehicle_registration_schema_certificate_data_vehicle_registration_from_dict = VehicleRegistrationSchemaCertificateDataVehicleRegistration.from_dict(vehicle_registration_schema_certificate_data_vehicle_registration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


