# HscerRequestCertificateParameters


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**full_name** | **str** | Full name | 
**rroll** | **str** | Roll No | 
**year** | **str** | Year | 

## Example

```python
from openapi_client.models.hscer_request_certificate_parameters import HscerRequestCertificateParameters

# TODO update the JSON string below
json = "{}"
# create an instance of HscerRequestCertificateParameters from a JSON string
hscer_request_certificate_parameters_instance = HscerRequestCertificateParameters.from_json(json)
# print the JSON string representation of the object
print(HscerRequestCertificateParameters.to_json())

# convert the object into a dict
hscer_request_certificate_parameters_dict = hscer_request_certificate_parameters_instance.to_dict()
# create an instance of HscerRequestCertificateParameters from a dict
hscer_request_certificate_parameters_from_dict = HscerRequestCertificateParameters.from_dict(hscer_request_certificate_parameters_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


