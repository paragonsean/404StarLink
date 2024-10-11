# AcademicCertificateSchemaCertificateData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**examination** | [**AcademicCertificateSchemaCertificateDataExamination**](AcademicCertificateSchemaCertificateDataExamination.md) |  | 
**performance** | [**AcademicCertificateSchemaCertificateDataPerformance**](AcademicCertificateSchemaCertificateDataPerformance.md) |  | 
**school** | [**AcademicCertificateSchemaCertificateDataSchool**](AcademicCertificateSchemaCertificateDataSchool.md) |  | 

## Example

```python
from openapi_client.models.academic_certificate_schema_certificate_data import AcademicCertificateSchemaCertificateData

# TODO update the JSON string below
json = "{}"
# create an instance of AcademicCertificateSchemaCertificateData from a JSON string
academic_certificate_schema_certificate_data_instance = AcademicCertificateSchemaCertificateData.from_json(json)
# print the JSON string representation of the object
print(AcademicCertificateSchemaCertificateData.to_json())

# convert the object into a dict
academic_certificate_schema_certificate_data_dict = academic_certificate_schema_certificate_data_instance.to_dict()
# create an instance of AcademicCertificateSchemaCertificateData from a dict
academic_certificate_schema_certificate_data_from_dict = AcademicCertificateSchemaCertificateData.from_dict(academic_certificate_schema_certificate_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


