# ValidatedocumentbyclustersRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**rule** | **str** |  | 

## Example

```python
from openapi_client.models.validatedocumentbyclusters_request import ValidatedocumentbyclustersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ValidatedocumentbyclustersRequest from a JSON string
validatedocumentbyclusters_request_instance = ValidatedocumentbyclustersRequest.from_json(json)
# print the JSON string representation of the object
print(ValidatedocumentbyclustersRequest.to_json())

# convert the object into a dict
validatedocumentbyclusters_request_dict = validatedocumentbyclusters_request_instance.to_dict()
# create an instance of ValidatedocumentbyclustersRequest from a dict
validatedocumentbyclusters_request_from_dict = ValidatedocumentbyclustersRequest.from_dict(validatedocumentbyclusters_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


