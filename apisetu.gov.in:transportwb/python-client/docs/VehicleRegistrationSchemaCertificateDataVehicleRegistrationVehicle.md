# VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chasis_no** | **str** |  | [optional] 
**var_class** | **object** |  | [optional] 
**color** | **str** |  | [optional] 
**cubic_capacity** | **object** |  | [optional] 
**cylinder** | **object** |  | [optional] 
**engine_no** | **str** |  | [optional] 
**fit_till** | **object** |  | [optional] 
**fuel_desc** | **object** |  | [optional] 
**make** | **object** |  | [optional] 
**mfg_date** | **object** |  | [optional] 
**model** | **str** |  | [optional] 
**seat_capacity** | **str** |  | [optional] 
**sleeper_capacity** | **str** |  | [optional] 
**standing_capacity** | **object** |  | [optional] 
**unladen_weight** | **str** |  | [optional] 
**wheelbase** | **object** |  | [optional] 

## Example

```python
from openapi_client.models.vehicle_registration_schema_certificate_data_vehicle_registration_vehicle import VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle

# TODO update the JSON string below
json = "{}"
# create an instance of VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle from a JSON string
vehicle_registration_schema_certificate_data_vehicle_registration_vehicle_instance = VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle.from_json(json)
# print the JSON string representation of the object
print(VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle.to_json())

# convert the object into a dict
vehicle_registration_schema_certificate_data_vehicle_registration_vehicle_dict = vehicle_registration_schema_certificate_data_vehicle_registration_vehicle_instance.to_dict()
# create an instance of VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle from a dict
vehicle_registration_schema_certificate_data_vehicle_registration_vehicle_from_dict = VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle.from_dict(vehicle_registration_schema_certificate_data_vehicle_registration_vehicle_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


