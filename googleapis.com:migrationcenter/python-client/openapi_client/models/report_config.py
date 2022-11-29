# coding: utf-8

"""
    Migration Center API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: v1alpha1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.report_config_group_preference_set_assignment import ReportConfigGroupPreferenceSetAssignment
from typing import Optional, Set
from typing_extensions import Self

class ReportConfig(BaseModel):
    """
    The groups and associated preference sets on which we can generate reports.
    """ # noqa: E501
    create_time: Optional[StrictStr] = Field(default=None, description="Output only. The timestamp when the resource was created.", alias="createTime")
    description: Optional[StrictStr] = Field(default=None, description="Free-text description.")
    display_name: Optional[StrictStr] = Field(default=None, description="User-friendly display name. Maximum length is 63 characters.", alias="displayName")
    group_preferenceset_assignments: Optional[List[ReportConfigGroupPreferenceSetAssignment]] = Field(default=None, description="Required. Collection of combinations of groups and preference sets.", alias="groupPreferencesetAssignments")
    name: Optional[StrictStr] = Field(default=None, description="Output only. Name of resource.")
    update_time: Optional[StrictStr] = Field(default=None, description="Output only. The timestamp when the resource was last updated.", alias="updateTime")
    __properties: ClassVar[List[str]] = ["createTime", "description", "displayName", "groupPreferencesetAssignments", "name", "updateTime"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of ReportConfig from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        """
        excluded_fields: Set[str] = set([
            "create_time",
            "name",
            "update_time",
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of each item in group_preferenceset_assignments (list)
        _items = []
        if self.group_preferenceset_assignments:
            for _item_group_preferenceset_assignments in self.group_preferenceset_assignments:
                if _item_group_preferenceset_assignments:
                    _items.append(_item_group_preferenceset_assignments.to_dict())
            _dict['groupPreferencesetAssignments'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ReportConfig from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "createTime": obj.get("createTime"),
            "description": obj.get("description"),
            "displayName": obj.get("displayName"),
            "groupPreferencesetAssignments": [ReportConfigGroupPreferenceSetAssignment.from_dict(_item) for _item in obj["groupPreferencesetAssignments"]] if obj.get("groupPreferencesetAssignments") is not None else None,
            "name": obj.get("name"),
            "updateTime": obj.get("updateTime")
        })
        return _obj


