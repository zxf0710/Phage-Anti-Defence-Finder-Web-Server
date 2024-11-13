import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listBasic(query) {
  return request({
    url: '/system/basic/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getBasic(basicId) {
  return request({
    url: '/system/basic/' + basicId,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addBasic(data) {
  return request({
    url: '/system/basic',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateBasic(data) {
  return request({
    url: '/system/basic',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delBasic(basicId) {
  return request({
    url: '/system/basic/' + basicId,
    method: 'delete'
  })
}
