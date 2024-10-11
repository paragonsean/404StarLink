# AcademicCertificateSchema


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certificate_data** | [**AcademicCertificateSchemaCertificateData**](AcademicCertificateSchemaCertificateData.md) |  | 
**issued_by** | [**AcademicCertificateSchemaIssuedBy**](AcademicCertificateSchemaIssuedBy.md) |  | 
**issued_to** | [**AcademicCertificateSchemaIssuedTo**](AcademicCertificateSchemaIssuedTo.md) |  | 
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
from openapi_client.models.academic_certificate_schema import AcademicCertificateSchema

# TODO update the JSON string below
json = "{}"
# create an instance of AcademicCertificateSchema from a JSON string
academic_certificate_schema_instance = AcademicCertificateSchema.from_json(json)
# print the JSON string representation of the object
print(AcademicCertificateSchema.to_json())

# convert the object into a dict
academic_certificate_schema_dict = academic_certificate_schema_instance.to_dict()
# create an instance of AcademicCertificateSchema from a dict
academic_certificate_schema_from_dict = AcademicCertificateSchema.from_dict(academic_certificate_schema_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


