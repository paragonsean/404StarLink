# DrivingLicenseSchemaIssuedToPerson


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
from openapi_client.models.driving_license_schema_issued_to_person import DrivingLicenseSchemaIssuedToPerson

# TODO update the JSON string below
json = "{}"
# create an instance of DrivingLicenseSchemaIssuedToPerson from a JSON string
driving_license_schema_issued_to_person_instance = DrivingLicenseSchemaIssuedToPerson.from_json(json)
# print the JSON string representation of the object
print(DrivingLicenseSchemaIssuedToPerson.to_json())

# convert the object into a dict
driving_license_schema_issued_to_person_dict = driving_license_schema_issued_to_person_instance.to_dict()
# create an instance of DrivingLicenseSchemaIssuedToPerson from a dict
driving_license_schema_issued_to_person_from_dict = DrivingLicenseSchemaIssuedToPerson.from_dict(driving_license_schema_issued_to_person_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


