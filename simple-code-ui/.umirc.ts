import { defineConfig } from 'umi';

export default defineConfig({
  nodeModulesTransform: {
    type: 'none',
  },
  layout: {
    name: 'Simple'
  },
  routes: [{
    path: '/code-generate',
    component: 'code-generate.tsx',
    menu: {
      name: '代码生成',
      icon: 'user',
    }
  }]
});
