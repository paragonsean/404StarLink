# EwcerRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certificate_parameters** | [**EwcerRequestCertificateParameters**](EwcerRequestCertificateParameters.md) |  | [optional] 
**consent_artifact** | [**ConsentArtifactSchema**](ConsentArtifactSchema.md) |  | [optional] 
**format** | **str** | The format of the certificate in response. | 
**txn_id** | **str** | A unique transaction id for this request in UUID format. It is used for tracking the request. | 

## Example

```python
from openapi_client.models.ewcer_request import EwcerRequest

# TODO update the JSON string below
json = "{}"
# create an instance of EwcerRequest from a JSON string
ewcer_request_instance = EwcerRequest.from_json(json)
# print the JSON string representation of the object
print(EwcerRequest.to_json())

# convert the object into a dict
ewcer_request_dict = ewcer_request_instance.to_dict()
# create an instance of EwcerRequest from a dict
ewcer_request_from_dict = EwcerRequest.from_dict(ewcer_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


