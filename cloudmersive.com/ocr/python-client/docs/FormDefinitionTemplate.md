# FormDefinitionTemplate

Definition of a form template; use a form template definition to recognize the fields in a form with Cloudmersive OCR

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field_definitions** | [**List[FormFieldDefinition]**](FormFieldDefinition.md) | Field definitions in the template; a field is comprised of a key/value pair | [optional] 
**table_definitions** | [**List[FormTableDefinition]**](FormTableDefinition.md) | Table definitions in the template; a table is comprised of columns and rows and exists in a 2-dimensional layout; a common example of a table would be an invoice | [optional] 

## Example

```python
from openapi_client.models.form_definition_template import FormDefinitionTemplate

# TODO update the JSON string below
json = "{}"
# create an instance of FormDefinitionTemplate from a JSON string
form_definition_template_instance = FormDefinitionTemplate.from_json(json)
# print the JSON string representation of the object
print(FormDefinitionTemplate.to_json())

# convert the object into a dict
form_definition_template_dict = form_definition_template_instance.to_dict()
# create an instance of FormDefinitionTemplate from a dict
form_definition_template_from_dict = FormDefinitionTemplate.from_dict(form_definition_template_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


