# RscerRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certificate_parameters** | [**RscerRequestCertificateParameters**](RscerRequestCertificateParameters.md) |  | [optional] 
**consent_artifact** | [**ConsentArtifactSchema**](ConsentArtifactSchema.md) |  | [optional] 
**format** | **str** | The format of the certificate in response. | 
**txn_id** | **str** | A unique transaction id for this request in UUID format. It is used for tracking the request. | 

## Example

```python
from openapi_client.models.rscer_request import RscerRequest

# TODO update the JSON string below
json = "{}"
# create an instance of RscerRequest from a JSON string
rscer_request_instance = RscerRequest.from_json(json)
# print the JSON string representation of the object
print(RscerRequest.to_json())

# convert the object into a dict
rscer_request_dict = rscer_request_instance.to_dict()
# create an instance of RscerRequest from a dict
rscer_request_from_dict = RscerRequest.from_dict(rscer_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


