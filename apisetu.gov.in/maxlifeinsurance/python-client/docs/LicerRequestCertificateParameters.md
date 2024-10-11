# LicerRequestCertificateParameters


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dob** | **str** | Date of birth in DD-MM-YYYY format | 
**full_name** | **str** | Full name | 
**polid** | **str** | Policy Number | 
**uid** | **str** | Aadhaar number | 

## Example

```python
from openapi_client.models.licer_request_certificate_parameters import LicerRequestCertificateParameters

# TODO update the JSON string below
json = "{}"
# create an instance of LicerRequestCertificateParameters from a JSON string
licer_request_certificate_parameters_instance = LicerRequestCertificateParameters.from_json(json)
# print the JSON string representation of the object
print(LicerRequestCertificateParameters.to_json())

# convert the object into a dict
licer_request_certificate_parameters_dict = licer_request_certificate_parameters_instance.to_dict()
# create an instance of LicerRequestCertificateParameters from a dict
licer_request_certificate_parameters_from_dict = LicerRequestCertificateParameters.from_dict(licer_request_certificate_parameters_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


