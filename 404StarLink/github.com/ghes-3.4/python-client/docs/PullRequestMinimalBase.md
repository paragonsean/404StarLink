# PullRequestMinimalBase


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ref** | **str** |  | 
**repo** | [**PullRequestMinimalBaseRepo**](PullRequestMinimalBaseRepo.md) |  | 
**sha** | **str** |  | 

## Example

```python
from openapi_client.models.pull_request_minimal_base import PullRequestMinimalBase

# TODO update the JSON string below
json = "{}"
# create an instance of PullRequestMinimalBase from a JSON string
pull_request_minimal_base_instance = PullRequestMinimalBase.from_json(json)
# print the JSON string representation of the object
print(PullRequestMinimalBase.to_json())

# convert the object into a dict
pull_request_minimal_base_dict = pull_request_minimal_base_instance.to_dict()
# create an instance of PullRequestMinimalBase from a dict
pull_request_minimal_base_from_dict = PullRequestMinimalBase.from_dict(pull_request_minimal_base_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


