# RvcerRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certificate_parameters** | [**RvcerRequestCertificateParameters**](RvcerRequestCertificateParameters.md) |  | [optional] 
**consent_artifact** | [**ConsentArtifactSchema**](ConsentArtifactSchema.md) |  | [optional] 
**format** | **str** | The format of the certificate in response. | 
**txn_id** | **str** | A unique transaction id for this request in UUID format. It is used for tracking the request. | 

## Example

```python
from openapi_client.models.rvcer_request import RvcerRequest

# TODO update the JSON string below
json = "{}"
# create an instance of RvcerRequest from a JSON string
rvcer_request_instance = RvcerRequest.from_json(json)
# print the JSON string representation of the object
print(RvcerRequest.to_json())

# convert the object into a dict
rvcer_request_dict = rvcer_request_instance.to_dict()
# create an instance of RvcerRequest from a dict
rvcer_request_from_dict = RvcerRequest.from_dict(rvcer_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


