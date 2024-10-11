# AcademicCertificateSchemaCertificateDataPerformance


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subjects** | [**List[AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner]**](AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner.md) |  | 
**cgpa** | **str** |  | 
**cgpa_max** | **str** |  | 
**grade** | **str** |  | 
**marks_max** | **str** |  | 
**marks_total** | **str** |  | 
**percentage** | **str** |  | 
**result** | **str** |  | 
**result_date** | **str** |  | 
**update_date** | **str** |  | 

## Example

```python
from openapi_client.models.academic_certificate_schema_certificate_data_performance import AcademicCertificateSchemaCertificateDataPerformance

# TODO update the JSON string below
json = "{}"
# create an instance of AcademicCertificateSchemaCertificateDataPerformance from a JSON string
academic_certificate_schema_certificate_data_performance_instance = AcademicCertificateSchemaCertificateDataPerformance.from_json(json)
# print the JSON string representation of the object
print(AcademicCertificateSchemaCertificateDataPerformance.to_json())

# convert the object into a dict
academic_certificate_schema_certificate_data_performance_dict = academic_certificate_schema_certificate_data_performance_instance.to_dict()
# create an instance of AcademicCertificateSchemaCertificateDataPerformance from a dict
academic_certificate_schema_certificate_data_performance_from_dict = AcademicCertificateSchemaCertificateDataPerformance.from_dict(academic_certificate_schema_certificate_data_performance_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


