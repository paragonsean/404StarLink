# BtcerRequestCertificateParameters


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dob** | **str** | Date of birth in DD-MM-YYYY format | 
**registration_id** | **str** | Registration Number | 

## Example

```python
from openapi_client.models.btcer_request_certificate_parameters import BtcerRequestCertificateParameters

# TODO update the JSON string below
json = "{}"
# create an instance of BtcerRequestCertificateParameters from a JSON string
btcer_request_certificate_parameters_instance = BtcerRequestCertificateParameters.from_json(json)
# print the JSON string representation of the object
print(BtcerRequestCertificateParameters.to_json())

# convert the object into a dict
btcer_request_certificate_parameters_dict = btcer_request_certificate_parameters_instance.to_dict()
# create an instance of BtcerRequestCertificateParameters from a dict
btcer_request_certificate_parameters_from_dict = BtcerRequestCertificateParameters.from_dict(btcer_request_certificate_parameters_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


