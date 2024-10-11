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

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.repos_update_information_about_pages_site_request_source import ReposUpdateInformationAboutPagesSiteRequestSource
from typing import Optional, Set
from typing_extensions import Self

class ReposUpdateInformationAboutPagesSiteRequest(BaseModel):
    """
    ReposUpdateInformationAboutPagesSiteRequest
    """ # noqa: E501
    build_type: Optional[StrictStr] = Field(default=None, description="The process by which the GitHub Pages site will be built. `workflow` means that the site is built by a custom GitHub Actions workflow. `legacy` means that the site is built by GitHub when changes are pushed to a specific branch.")
    cname: Optional[StrictStr] = Field(default=None, description="Specify a custom domain for the repository. Sending a `null` value will remove the custom domain. For more about custom domains, see \"[Using a custom domain with GitHub Pages](https://docs.github.com/enterprise-server@3.4/articles/using-a-custom-domain-with-github-pages/).\"")
    https_enforced: Optional[StrictBool] = Field(default=None, description="Specify whether HTTPS should be enforced for the repository.")
    source: Optional[ReposUpdateInformationAboutPagesSiteRequestSource] = None
    __properties: ClassVar[List[str]] = []

    @field_validator('build_type')
    def build_type_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['legacy', 'workflow']):
            raise ValueError("must be one of enum values ('legacy', 'workflow')")
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
        """Create an instance of ReposUpdateInformationAboutPagesSiteRequest from a JSON string"""
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
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ReposUpdateInformationAboutPagesSiteRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
        })
        return _obj


