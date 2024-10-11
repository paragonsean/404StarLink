# RscerRequestCertificateParameters


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dob** | **str** | Date of birth in DD-MM-YYYY format | 
**dsnno** | **str** | DSN Number | 
**father_name** | **str** | Father Name | 
**full_name** | **str** | Full name | 
**uid** | **str** | Aadhaar number | 

## Example

```python
from openapi_client.models.rscer_request_certificate_parameters import RscerRequestCertificateParameters

# TODO update the JSON string below
json = "{}"
# create an instance of RscerRequestCertificateParameters from a JSON string
rscer_request_certificate_parameters_instance = RscerRequestCertificateParameters.from_json(json)
# print the JSON string representation of the object
print(RscerRequestCertificateParameters.to_json())

# convert the object into a dict
rscer_request_certificate_parameters_dict = rscer_request_certificate_parameters_instance.to_dict()
# create an instance of RscerRequestCertificateParameters from a dict
rscer_request_certificate_parameters_from_dict = RscerRequestCertificateParameters.from_dict(rscer_request_certificate_parameters_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


