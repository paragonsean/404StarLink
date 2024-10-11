# AcademicCertificateSchemaIssuedByOrganization


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
from openapi_client.models.academic_certificate_schema_issued_by_organization import AcademicCertificateSchemaIssuedByOrganization

# TODO update the JSON string below
json = "{}"
# create an instance of AcademicCertificateSchemaIssuedByOrganization from a JSON string
academic_certificate_schema_issued_by_organization_instance = AcademicCertificateSchemaIssuedByOrganization.from_json(json)
# print the JSON string representation of the object
print(AcademicCertificateSchemaIssuedByOrganization.to_json())

# convert the object into a dict
academic_certificate_schema_issued_by_organization_dict = academic_certificate_schema_issued_by_organization_instance.to_dict()
# create an instance of AcademicCertificateSchemaIssuedByOrganization from a dict
academic_certificate_schema_issued_by_organization_from_dict = AcademicCertificateSchemaIssuedByOrganization.from_dict(academic_certificate_schema_issued_by_organization_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


