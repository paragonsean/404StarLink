# PullRequestSimpleLabelsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**color** | **str** |  | 
**default** | **bool** |  | 
**description** | **str** |  | 
**id** | **int** |  | 
**name** | **str** |  | 
**node_id** | **str** |  | 
**url** | **str** |  | 

## Example

```python
from openapi_client.models.pull_request_simple_labels_inner import PullRequestSimpleLabelsInner

# TODO update the JSON string below
json = "{}"
# create an instance of PullRequestSimpleLabelsInner from a JSON string
pull_request_simple_labels_inner_instance = PullRequestSimpleLabelsInner.from_json(json)
# print the JSON string representation of the object
print(PullRequestSimpleLabelsInner.to_json())

# convert the object into a dict
pull_request_simple_labels_inner_dict = pull_request_simple_labels_inner_instance.to_dict()
# create an instance of PullRequestSimpleLabelsInner from a dict
pull_request_simple_labels_inner_from_dict = PullRequestSimpleLabelsInner.from_dict(pull_request_simple_labels_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


