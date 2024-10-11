# AcademicCertificateSchemaIssuedToPersonAddress


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | **str** |  | 
**district** | **str** |  | 
**house** | **str** |  | 
**landmark** | **str** |  | 
**line1** | **str** |  | 
**line2** | **str** |  | 
**locality** | **str** |  | 
**pin** | **str** |  | 
**state** | **str** |  | 
**type** | **str** |  | 
**vtc** | **str** |  | 

## Example

```python
from openapi_client.models.academic_certificate_schema_issued_to_person_address import AcademicCertificateSchemaIssuedToPersonAddress

# TODO update the JSON string below
json = "{}"
# create an instance of AcademicCertificateSchemaIssuedToPersonAddress from a JSON string
academic_certificate_schema_issued_to_person_address_instance = AcademicCertificateSchemaIssuedToPersonAddress.from_json(json)
# print the JSON string representation of the object
print(AcademicCertificateSchemaIssuedToPersonAddress.to_json())

# convert the object into a dict
academic_certificate_schema_issued_to_person_address_dict = academic_certificate_schema_issued_to_person_address_instance.to_dict()
# create an instance of AcademicCertificateSchemaIssuedToPersonAddress from a dict
academic_certificate_schema_issued_to_person_address_from_dict = AcademicCertificateSchemaIssuedToPersonAddress.from_dict(academic_certificate_schema_issued_to_person_address_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


