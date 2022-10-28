# DrvlcRequestCertificateParameters


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dob** | **str** | Date of birth in DD-MM-YYYY format | 
**full_name** | **str** | Full name | 
**uid** | **str** | Aadhaar number | 
**dlno** | **str** | DL No | 

## Example

```python
from openapi_client.models.drvlc_request_certificate_parameters import DrvlcRequestCertificateParameters

# TODO update the JSON string below
json = "{}"
# create an instance of DrvlcRequestCertificateParameters from a JSON string
drvlc_request_certificate_parameters_instance = DrvlcRequestCertificateParameters.from_json(json)
# print the JSON string representation of the object
print(DrvlcRequestCertificateParameters.to_json())

# convert the object into a dict
drvlc_request_certificate_parameters_dict = drvlc_request_certificate_parameters_instance.to_dict()
# create an instance of DrvlcRequestCertificateParameters from a dict
drvlc_request_certificate_parameters_from_dict = DrvlcRequestCertificateParameters.from_dict(drvlc_request_certificate_parameters_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


