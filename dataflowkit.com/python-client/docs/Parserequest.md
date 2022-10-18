# Parserequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**common_parent** | **str** | Specifies common ancestor block for a set of fields used to extract data from a web page. _(CSS Selector)_ | [optional] 
**fields** | [**List[ModelField]**](ModelField.md) | Define a  set of fields used to extract data from a web page. A Field represents a given chunk of extracted data from every block on each page.  | 
**format** | **str** | Extracted data is returned either in CSV, MS Excel, JSON, JSON(Lines) or XML format. | 
**name** | **str** | Collection name. | 
**paginator** | [**Paginator**](Paginator.md) |  | [optional] 
**path** | **bool** | Path is a special parameter specifying navigation pages only. It collects information from detailed pages. No results from the current page return. Defaults to false. | [optional] [default to False]
**request** | [**Fetchrequest**](Fetchrequest.md) |  | [optional] 

## Example

```python
from openapi_client.models.parserequest import Parserequest

# TODO update the JSON string below
json = "{}"
# create an instance of Parserequest from a JSON string
parserequest_instance = Parserequest.from_json(json)
# print the JSON string representation of the object
print(Parserequest.to_json())

# convert the object into a dict
parserequest_dict = parserequest_instance.to_dict()
# create an instance of Parserequest from a dict
parserequest_from_dict = Parserequest.from_dict(parserequest_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


