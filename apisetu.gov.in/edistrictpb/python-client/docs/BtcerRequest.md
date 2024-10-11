# BtcerRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certificate_parameters** | [**BtcerRequestCertificateParameters**](BtcerRequestCertificateParameters.md) |  | [optional] 
**consent_artifact** | [**ConsentArtifactSchema**](ConsentArtifactSchema.md) |  | [optional] 
**format** | **str** | The format of the certificate in response. | 
**txn_id** | **str** | A unique transaction id for this request in UUID format. It is used for tracking the request. | 

## Example

```python
from openapi_client.models.btcer_request import BtcerRequest

# TODO update the JSON string below
json = "{}"
# create an instance of BtcerRequest from a JSON string
btcer_request_instance = BtcerRequest.from_json(json)
# print the JSON string representation of the object
print(BtcerRequest.to_json())

# convert the object into a dict
btcer_request_dict = btcer_request_instance.to_dict()
# create an instance of BtcerRequest from a dict
btcer_request_from_dict = BtcerRequest.from_dict(btcer_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


