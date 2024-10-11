# AcademicCertificateSchemaIssuedToPerson


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | [**AcademicCertificateSchemaIssuedToPersonAddress**](AcademicCertificateSchemaIssuedToPersonAddress.md) |  | 
**photo** | [**AcademicCertificateSchemaIssuedToPersonPhoto**](AcademicCertificateSchemaIssuedToPersonPhoto.md) |  | 
**category** | **str** |  | 
**disability_status** | **str** |  | 
**dob** | **str** |  | 
**email** | **str** |  | 
**gender** | **str** |  | 
**marital_status** | **str** |  | 
**mother_name** | **str** |  | 
**name** | **str** |  | 
**phone** | **str** |  | 
**religion** | **str** |  | 
**swd** | **str** |  | 
**swd_indicator** | **str** |  | 
**title** | **str** |  | 
**uid** | **str** |  | 

## Example

```python
from openapi_client.models.academic_certificate_schema_issued_to_person import AcademicCertificateSchemaIssuedToPerson

# TODO update the JSON string below
json = "{}"
# create an instance of AcademicCertificateSchemaIssuedToPerson from a JSON string
academic_certificate_schema_issued_to_person_instance = AcademicCertificateSchemaIssuedToPerson.from_json(json)
# print the JSON string representation of the object
print(AcademicCertificateSchemaIssuedToPerson.to_json())

# convert the object into a dict
academic_certificate_schema_issued_to_person_dict = academic_certificate_schema_issued_to_person_instance.to_dict()
# create an instance of AcademicCertificateSchemaIssuedToPerson from a dict
academic_certificate_schema_issued_to_person_from_dict = AcademicCertificateSchemaIssuedToPerson.from_dict(academic_certificate_schema_issued_to_person_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


