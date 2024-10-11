# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from datetime import datetime
from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.nullable_simple_user import NullableSimpleUser
from typing import Optional, Set
from typing_extensions import Self

class ProjectCard(BaseModel):
    """
    Project cards represent a scope of work.
    """ # noqa: E501
    archived: Optional[StrictBool] = Field(default=None, description="Whether or not the card is archived")
    column_name: Optional[StrictStr] = None
    column_url: StrictStr
    content_url: Optional[StrictStr] = None
    created_at: datetime
    creator: Optional[NullableSimpleUser]
    id: StrictInt = Field(description="The project card's ID")
    node_id: StrictStr
    note: Optional[StrictStr]
    project_id: Optional[StrictStr] = None
    project_url: StrictStr
    updated_at: datetime
    url: StrictStr
    __properties: ClassVar[List[str]] = ["archived", "column_name", "column_url", "content_url", "created_at", "creator", "id", "node_id", "note", "project_id", "project_url", "updated_at", "url"]

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
        """Create an instance of ProjectCard from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of creator
        if self.creator:
            _dict['creator'] = self.creator.to_dict()
        # set to None if creator (nullable) is None
        # and model_fields_set contains the field
        if self.creator is None and "creator" in self.model_fields_set:
            _dict['creator'] = None

        # set to None if note (nullable) is None
        # and model_fields_set contains the field
        if self.note is None and "note" in self.model_fields_set:
            _dict['note'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ProjectCard from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "archived": obj.get("archived"),
            "column_name": obj.get("column_name"),
            "column_url": obj.get("column_url"),
            "content_url": obj.get("content_url"),
            "created_at": obj.get("created_at"),
            "creator": NullableSimpleUser.from_dict(obj["creator"]) if obj.get("creator") is not None else None,
            "id": obj.get("id"),
            "node_id": obj.get("node_id"),
            "note": obj.get("note"),
            "project_id": obj.get("project_id"),
            "project_url": obj.get("project_url"),
            "updated_at": obj.get("updated_at"),
            "url": obj.get("url")
        })
        return _obj


