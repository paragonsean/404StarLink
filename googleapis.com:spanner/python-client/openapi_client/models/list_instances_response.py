# coding: utf-8

"""
    Cloud Spanner API

    Cloud Spanner is a managed, mission-critical, globally consistent and scalable relational database service.

    The version of the OpenAPI document: v1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.instance import Instance
from typing import Optional, Set
from typing_extensions import Self

class ListInstancesResponse(BaseModel):
    """
    The response for ListInstances.
    """ # noqa: E501
    instances: Optional[List[Instance]] = Field(default=None, description="The list of requested instances.")
    next_page_token: Optional[StrictStr] = Field(default=None, description="`next_page_token` can be sent in a subsequent ListInstances call to fetch more of the matching instances.", alias="nextPageToken")
    unreachable: Optional[List[StrictStr]] = Field(default=None, description="The list of unreachable instances. It includes the names of instances whose metadata could not be retrieved within instance_deadline.")
    __properties: ClassVar[List[str]] = ["instances", "nextPageToken", "unreachable"]

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
        """Create an instance of ListInstancesResponse from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in instances (list)
        _items = []
        if self.instances:
            for _item_instances in self.instances:
                if _item_instances:
                    _items.append(_item_instances.to_dict())
            _dict['instances'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ListInstancesResponse from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "instances": [Instance.from_dict(_item) for _item in obj["instances"]] if obj.get("instances") is not None else None,
            "nextPageToken": obj.get("nextPageToken"),
            "unreachable": obj.get("unreachable")
        })
        return _obj


