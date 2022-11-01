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
from pydantic import BaseModel, ConfigDict, Field, StrictInt, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.nullable_team_simple import NullableTeamSimple
from openapi_client.models.team_organization import TeamOrganization
from typing import Optional, Set
from typing_extensions import Self

class TeamFull(BaseModel):
    """
    Groups of organization members that gives permissions on specified repositories.
    """ # noqa: E501
    created_at: datetime
    description: Optional[StrictStr]
    html_url: StrictStr
    id: StrictInt = Field(description="Unique identifier of the team")
    ldap_dn: Optional[StrictStr] = Field(default=None, description="Distinguished Name (DN) that team maps to within LDAP environment")
    members_count: StrictInt
    members_url: StrictStr
    name: StrictStr = Field(description="Name of the team")
    node_id: StrictStr
    organization: TeamOrganization
    parent: Optional[NullableTeamSimple] = None
    permission: StrictStr = Field(description="Permission that the team will have for its repositories")
    privacy: Optional[StrictStr] = Field(default=None, description="The level of privacy this team should have")
    repos_count: StrictInt
    repositories_url: StrictStr
    slug: StrictStr
    updated_at: datetime
    url: StrictStr = Field(description="URL for the team")
    __properties: ClassVar[List[str]] = ["created_at", "description", "html_url", "id", "ldap_dn", "members_count", "members_url", "name", "node_id", "organization", "parent", "permission", "privacy", "repos_count", "repositories_url", "slug", "updated_at", "url"]

    @field_validator('privacy')
    def privacy_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['closed', 'secret']):
            raise ValueError("must be one of enum values ('closed', 'secret')")
        return value

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
        """Create an instance of TeamFull from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of organization
        if self.organization:
            _dict['organization'] = self.organization.to_dict()
        # override the default output from pydantic by calling `to_dict()` of parent
        if self.parent:
            _dict['parent'] = self.parent.to_dict()
        # set to None if description (nullable) is None
        # and model_fields_set contains the field
        if self.description is None and "description" in self.model_fields_set:
            _dict['description'] = None

        # set to None if parent (nullable) is None
        # and model_fields_set contains the field
        if self.parent is None and "parent" in self.model_fields_set:
            _dict['parent'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of TeamFull from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "created_at": obj.get("created_at"),
            "description": obj.get("description"),
            "html_url": obj.get("html_url"),
            "id": obj.get("id"),
            "ldap_dn": obj.get("ldap_dn"),
            "members_count": obj.get("members_count"),
            "members_url": obj.get("members_url"),
            "name": obj.get("name"),
            "node_id": obj.get("node_id"),
            "organization": TeamOrganization.from_dict(obj["organization"]) if obj.get("organization") is not None else None,
            "parent": NullableTeamSimple.from_dict(obj["parent"]) if obj.get("parent") is not None else None,
            "permission": obj.get("permission"),
            "privacy": obj.get("privacy"),
            "repos_count": obj.get("repos_count"),
            "repositories_url": obj.get("repositories_url"),
            "slug": obj.get("slug"),
            "updated_at": obj.get("updated_at"),
            "url": obj.get("url")
        })
        return _obj


