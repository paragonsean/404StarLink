# DrvlcRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certificate_parameters** | [**DrvlcRequestCertificateParameters**](DrvlcRequestCertificateParameters.md) |  | [optional] 
**consent_artifact** | [**ConsentArtifactSchema**](ConsentArtifactSchema.md) |  | [optional] 
**format** | **str** | The format of the certificate in response. | 
**txn_id** | **str** | A unique transaction id for this request in UUID format. It is used for tracking the request. | 

## Example

```python
from openapi_client.models.drvlc_request import DrvlcRequest

# TODO update the JSON string below
json = "{}"
# create an instance of DrvlcRequest from a JSON string
drvlc_request_instance = DrvlcRequest.from_json(json)
# print the JSON string representation of the object
print(DrvlcRequest.to_json())

# convert the object into a dict
drvlc_request_dict = drvlc_request_instance.to_dict()
# create an instance of DrvlcRequest from a dict
drvlc_request_from_dict = DrvlcRequest.from_dict(drvlc_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


