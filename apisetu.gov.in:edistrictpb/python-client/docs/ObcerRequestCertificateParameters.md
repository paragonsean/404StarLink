# ObcerRequestCertificateParameters


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dob** | **str** | Date of birth in DD-MM-YYYY format | 
**dsnno** | **str** | DSN No | 
**father** | **str** | Father Name | 
**full_name** | **str** | Full name | 
**uid** | **str** | Aadhaar number | 

## Example

```python
from openapi_client.models.obcer_request_certificate_parameters import ObcerRequestCertificateParameters

# TODO update the JSON string below
json = "{}"
# create an instance of ObcerRequestCertificateParameters from a JSON string
obcer_request_certificate_parameters_instance = ObcerRequestCertificateParameters.from_json(json)
# print the JSON string representation of the object
print(ObcerRequestCertificateParameters.to_json())

# convert the object into a dict
obcer_request_certificate_parameters_dict = obcer_request_certificate_parameters_instance.to_dict()
# create an instance of ObcerRequestCertificateParameters from a dict
obcer_request_certificate_parameters_from_dict = ObcerRequestCertificateParameters.from_dict(obcer_request_certificate_parameters_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


