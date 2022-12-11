# ActiveWidgetList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**meta** | [**PagingMeta**](PagingMeta.md) |  | [optional] 
**widgets** | [**List[ActiveWidget]**](ActiveWidget.md) |  | [optional] 

## Example

```python
from openapi_client.models.active_widget_list import ActiveWidgetList

# TODO update the JSON string below
json = "{}"
# create an instance of ActiveWidgetList from a JSON string
active_widget_list_instance = ActiveWidgetList.from_json(json)
# print the JSON string representation of the object
print(ActiveWidgetList.to_json())

# convert the object into a dict
active_widget_list_dict = active_widget_list_instance.to_dict()
# create an instance of ActiveWidgetList from a dict
active_widget_list_from_dict = ActiveWidgetList.from_dict(active_widget_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


