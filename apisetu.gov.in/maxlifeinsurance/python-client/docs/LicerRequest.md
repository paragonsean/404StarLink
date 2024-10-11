# LicerRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certificate_parameters** | [**LicerRequestCertificateParameters**](LicerRequestCertificateParameters.md) |  | [optional] 
**consent_artifact** | [**ConsentArtifactSchema**](ConsentArtifactSchema.md) |  | [optional] 
**format** | **str** | The format of the certificate in response. | 
**txn_id** | **str** | A unique transaction id for this request in UUID format. It is used for tracking the request. | 

## Example

```python
from openapi_client.models.licer_request import LicerRequest

# TODO update the JSON string below
json = "{}"
# create an instance of LicerRequest from a JSON string
licer_request_instance = LicerRequest.from_json(json)
# print the JSON string representation of the object
print(LicerRequest.to_json())

# convert the object into a dict
licer_request_dict = licer_request_instance.to_dict()
# create an instance of LicerRequest from a dict
licer_request_from_dict = LicerRequest.from_dict(licer_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


