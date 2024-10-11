# SelectedActions


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**github_owned_allowed** | **bool** | Whether GitHub-owned actions are allowed. For example, this includes the actions in the &#x60;actions&#x60; organization. | 
**patterns_allowed** | **List[str]** | Specifies a list of string-matching patterns to allow specific action(s). Wildcards, tags, and SHAs are allowed. For example, &#x60;monalisa/octocat@*&#x60;, &#x60;monalisa/octocat@v2&#x60;, &#x60;monalisa/*&#x60;. | 

## Example

```python
from openapi_client.models.selected_actions import SelectedActions

# TODO update the JSON string below
json = "{}"
# create an instance of SelectedActions from a JSON string
selected_actions_instance = SelectedActions.from_json(json)
# print the JSON string representation of the object
print(SelectedActions.to_json())

# convert the object into a dict
selected_actions_dict = selected_actions_instance.to_dict()
# create an instance of SelectedActions from a dict
selected_actions_from_dict = SelectedActions.from_dict(selected_actions_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


