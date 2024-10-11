# PullRequestSimpleBase


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**label** | **str** |  | 
**ref** | **str** |  | 
**repo** | [**Repository**](Repository.md) |  | 
**sha** | **str** |  | 
**user** | [**NullableSimpleUser**](NullableSimpleUser.md) |  | 

## Example

```python
from openapi_client.models.pull_request_simple_base import PullRequestSimpleBase

# TODO update the JSON string below
json = "{}"
# create an instance of PullRequestSimpleBase from a JSON string
pull_request_simple_base_instance = PullRequestSimpleBase.from_json(json)
# print the JSON string representation of the object
print(PullRequestSimpleBase.to_json())

# convert the object into a dict
pull_request_simple_base_dict = pull_request_simple_base_instance.to_dict()
# create an instance of PullRequestSimpleBase from a dict
pull_request_simple_base_from_dict = PullRequestSimpleBase.from_dict(pull_request_simple_base_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


