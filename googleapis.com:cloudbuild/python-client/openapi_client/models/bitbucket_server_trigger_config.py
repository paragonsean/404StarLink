# coding: utf-8

"""
    Cloud Build API

    Creates and manages builds on Google Cloud Platform.

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
from openapi_client.models.bitbucket_server_config import BitbucketServerConfig
from openapi_client.models.pull_request_filter import PullRequestFilter
from openapi_client.models.push_filter import PushFilter
from typing import Optional, Set
from typing_extensions import Self

class BitbucketServerTriggerConfig(BaseModel):
    """
    BitbucketServerTriggerConfig describes the configuration of a trigger that creates a build whenever a Bitbucket Server event is received.
    """ # noqa: E501
    bitbucket_server_config: Optional[BitbucketServerConfig] = Field(default=None, alias="bitbucketServerConfig")
    bitbucket_server_config_resource: Optional[StrictStr] = Field(default=None, description="Required. The Bitbucket server config resource that this trigger config maps to.", alias="bitbucketServerConfigResource")
    project_key: Optional[StrictStr] = Field(default=None, description="Required. Key of the project that the repo is in. For example: The key for https://mybitbucket.server/projects/TEST/repos/test-repo is \"TEST\".", alias="projectKey")
    pull_request: Optional[PullRequestFilter] = Field(default=None, alias="pullRequest")
    push: Optional[PushFilter] = None
    repo_slug: Optional[StrictStr] = Field(default=None, description="Required. Slug of the repository. A repository slug is a URL-friendly version of a repository name, automatically generated by Bitbucket for use in the URL. For example, if the repository name is 'test repo', in the URL it would become 'test-repo' as in https://mybitbucket.server/projects/TEST/repos/test-repo.", alias="repoSlug")
    __properties: ClassVar[List[str]] = ["bitbucketServerConfig", "bitbucketServerConfigResource", "projectKey", "pullRequest", "push", "repoSlug"]

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
        """Create an instance of BitbucketServerTriggerConfig from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of bitbucket_server_config
        if self.bitbucket_server_config:
            _dict['bitbucketServerConfig'] = self.bitbucket_server_config.to_dict()
        # override the default output from pydantic by calling `to_dict()` of pull_request
        if self.pull_request:
            _dict['pullRequest'] = self.pull_request.to_dict()
        # override the default output from pydantic by calling `to_dict()` of push
        if self.push:
            _dict['push'] = self.push.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of BitbucketServerTriggerConfig from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "bitbucketServerConfig": BitbucketServerConfig.from_dict(obj["bitbucketServerConfig"]) if obj.get("bitbucketServerConfig") is not None else None,
            "bitbucketServerConfigResource": obj.get("bitbucketServerConfigResource"),
            "projectKey": obj.get("projectKey"),
            "pullRequest": PullRequestFilter.from_dict(obj["pullRequest"]) if obj.get("pullRequest") is not None else None,
            "push": PushFilter.from_dict(obj["push"]) if obj.get("push") is not None else None,
            "repoSlug": obj.get("repoSlug")
        })
        return _obj


