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

from pydantic import BaseModel, ConfigDict, Field, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from typing import Optional, Set
from typing_extensions import Self

class TeamSimple(BaseModel):
    """
    Groups of organization members that gives permissions on specified repositories.
    """ # noqa: E501
    description: Optional[StrictStr] = Field(description="Description of the team")
    html_url: StrictStr
    id: StrictInt = Field(description="Unique identifier of the team")
    ldap_dn: Optional[StrictStr] = Field(default=None, description="Distinguished Name (DN) that team maps to within LDAP environment")
    members_url: StrictStr
    name: StrictStr = Field(description="Name of the team")
    node_id: StrictStr
    permission: StrictStr = Field(description="Permission that the team will have for its repositories")
    privacy: Optional[StrictStr] = Field(default=None, description="The level of privacy this team should have")
    repositories_url: StrictStr
    slug: StrictStr
    url: StrictStr = Field(description="URL for the team")
    __properties: ClassVar[List[str]] = ["description", "html_url", "id", "ldap_dn", "members_url", "name", "node_id", "permission", "privacy", "repositories_url", "slug", "url"]

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
        """Create an instance of TeamSimple from a JSON string"""
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
        # set to None if description (nullable) is None
        # and model_fields_set contains the field
        if self.description is None and "description" in self.model_fields_set:
            _dict['description'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of TeamSimple from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "description": obj.get("description"),
            "html_url": obj.get("html_url"),
            "id": obj.get("id"),
            "ldap_dn": obj.get("ldap_dn"),
            "members_url": obj.get("members_url"),
            "name": obj.get("name"),
            "node_id": obj.get("node_id"),
            "permission": obj.get("permission"),
            "privacy": obj.get("privacy"),
            "repositories_url": obj.get("repositories_url"),
            "slug": obj.get("slug"),
            "url": obj.get("url")
        })
        return _obj


