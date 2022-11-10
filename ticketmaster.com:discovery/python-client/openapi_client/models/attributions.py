# coding: utf-8

"""
    Discovery API

    The Ticketmaster Discovery API allows you to search for events, attractions, or venues.

    The version of the OpenAPI document: v2
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.attribution import Attribution
from typing import Optional, Set
from typing_extensions import Self

class Attributions(BaseModel):
    """
    Attributions
    """ # noqa: E501
    description: Optional[Attribution] = None
    descriptions: Optional[Dict[str, Attribution]] = Field(default=None, description="Attribution descriptions - multi-lingual fields")
    __properties: ClassVar[List[str]] = ["description", "descriptions"]

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
        """Create an instance of Attributions from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of description
        if self.description:
            _dict['description'] = self.description.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each value in descriptions (dict)
        _field_dict = {}
        if self.descriptions:
            for _key_descriptions in self.descriptions:
                if self.descriptions[_key_descriptions]:
                    _field_dict[_key_descriptions] = self.descriptions[_key_descriptions].to_dict()
            _dict['descriptions'] = _field_dict
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Attributions from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "description": Attribution.from_dict(obj["description"]) if obj.get("description") is not None else None,
            "descriptions": dict(
                (_k, Attribution.from_dict(_v))
                for _k, _v in obj["descriptions"].items()
            )
            if obj.get("descriptions") is not None
            else None
        })
        return _obj


