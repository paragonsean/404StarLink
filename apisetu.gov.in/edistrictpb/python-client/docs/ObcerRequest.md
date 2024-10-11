# ObcerRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certificate_parameters** | [**ObcerRequestCertificateParameters**](ObcerRequestCertificateParameters.md) |  | [optional] 
**consent_artifact** | [**ConsentArtifactSchema**](ConsentArtifactSchema.md) |  | [optional] 
**format** | **str** | The format of the certificate in response. | 
**txn_id** | **str** | A unique transaction id for this request in UUID format. It is used for tracking the request. | 

## Example

```python
from openapi_client.models.obcer_request import ObcerRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ObcerRequest from a JSON string
obcer_request_instance = ObcerRequest.from_json(json)
# print the JSON string representation of the object
print(ObcerRequest.to_json())

# convert the object into a dict
obcer_request_dict = obcer_request_instance.to_dict()
# create an instance of ObcerRequest from a dict
obcer_request_from_dict = ObcerRequest.from_dict(obcer_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


