# EwcerRequestCertificateParameters


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dob** | **str** | Date of birth in DD-MM-YYYY format | 
**dsn** | **str** | DSN Number | 

## Example

```python
from openapi_client.models.ewcer_request_certificate_parameters import EwcerRequestCertificateParameters

# TODO update the JSON string below
json = "{}"
# create an instance of EwcerRequestCertificateParameters from a JSON string
ewcer_request_certificate_parameters_instance = EwcerRequestCertificateParameters.from_json(json)
# print the JSON string representation of the object
print(EwcerRequestCertificateParameters.to_json())

# convert the object into a dict
ewcer_request_certificate_parameters_dict = ewcer_request_certificate_parameters_instance.to_dict()
# create an instance of EwcerRequestCertificateParameters from a dict
ewcer_request_certificate_parameters_from_dict = EwcerRequestCertificateParameters.from_dict(ewcer_request_certificate_parameters_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


