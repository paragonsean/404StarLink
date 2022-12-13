# HscerRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certificate_parameters** | [**HscerRequestCertificateParameters**](HscerRequestCertificateParameters.md) |  | [optional] 
**consent_artifact** | [**ConsentArtifactSchema**](ConsentArtifactSchema.md) |  | [optional] 
**format** | **str** | The format of the certificate in response. | 
**txn_id** | **str** | A unique transaction id for this request in UUID format. It is used for tracking the request. | 

## Example

```python
from openapi_client.models.hscer_request import HscerRequest

# TODO update the JSON string below
json = "{}"
# create an instance of HscerRequest from a JSON string
hscer_request_instance = HscerRequest.from_json(json)
# print the JSON string representation of the object
print(HscerRequest.to_json())

# convert the object into a dict
hscer_request_dict = hscer_request_instance.to_dict()
# create an instance of HscerRequest from a dict
hscer_request_from_dict = HscerRequest.from_dict(hscer_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


